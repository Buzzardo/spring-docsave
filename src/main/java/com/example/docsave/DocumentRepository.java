package com.example.docsave;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "documents", path = "documents")
public interface DocumentRepository extends MongoRepository<Document, String> {

	List<Document> findByName(@Param("name") String name);

}
