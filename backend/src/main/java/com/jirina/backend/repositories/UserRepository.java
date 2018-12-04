package com.jirina.backend.repositories;

import com.jirina.backend.models.GuestBookUser;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.OneToOne;

public interface UserRepository extends CrudRepository <GuestBookUser, Long>   {
    GuestBookUser findGuestBookUserByUsername (String username);

}
