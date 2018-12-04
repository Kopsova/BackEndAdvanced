package com.jirina.backend.repositories;

import com.jirina.backend.models.Token;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TokenRepository extends CrudRepository <Token,  Long> {


}
