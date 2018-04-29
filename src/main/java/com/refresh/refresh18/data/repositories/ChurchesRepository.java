package com.refresh.refresh18.data.repositories;

import com.refresh.refresh18.data.entity.Churches;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChurchesRepository extends MongoRepository<Churches,String> {

}
