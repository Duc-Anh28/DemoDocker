package com.example.demodockerv1.DAO;

import com.example.demodockerv1.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDAO extends JpaRepository<Account, String> {

}
	