package com.refresh.refresh18.data.repositories;

import com.refresh.refresh18.data.entity.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users,String> {

}
