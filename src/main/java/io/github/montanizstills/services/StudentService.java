package io.github.montanizstills.services;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import io.github.montanizstills.models.*;
import io.github.montanizstills.repositories.StudentRepository;
import io.github.montanizstills.services.datafetchers.AllStudentsDataFetcher;
import io.github.montanizstills.services.datafetchers.StudentDataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.stream.Stream;

@Service
public class StudentService {

    @Value("classpath:Student.graphql")
    Resource resource;

    private GraphQL graphQL;

    @Autowired
    private AllStudentsDataFetcher allStudentsDataFetcher;

    @Autowired
    private StudentDataFetcher studentDataFetcher;

    //load schema at application start up
    @PostConstruct
    private void loadSchema() throws IOException {
        //get schema
        File schemaFile = resource.getFile();
        //parse schema
        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schemaFile);
        RuntimeWiring runtimeWiring = buildRuntimeWiring();
        GraphQLSchema graphQLSchema = new SchemaGenerator().makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);
        graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    private RuntimeWiring buildRuntimeWiring() {
        return RuntimeWiring.newRuntimeWiring()
                .type("StudentQuery", typeWiring ->
                        typeWiring
                                .dataFetcher("allStudents", allStudentsDataFetcher)
                                .dataFetcher("student", studentDataFetcher)
                )
                .build();
    }

    public GraphQL getGraphQL() {
        return graphQL;
    }
}
