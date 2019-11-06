package com.datafoundry.RegistrationForm.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.datafoundry.RegistrationForm.ModelClass.User;


@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
