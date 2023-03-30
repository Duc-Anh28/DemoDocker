package com.example.demodockerv1.Service;

import com.example.demodockerv1.entity.Account;
import com.example.demodockerv1.repository.AccountRepository;
import com.example.demodockerv1.repository.RoleRepository;
import com.example.demodockerv1.request.authentication.SignupRequest;
import com.example.demodockerv1.util.CommonUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final RoleRepository roleRepository;

    @Override
    public void signup(SignupRequest request) {
        Account account = new Account();
        account.setEmail(request.getEmail());
        account.setPassword(request.getPassword());
        account.setIsActive(false);
        if (CommonUtil.isNotEmpty(request.getRoles())){
            var roles = roleRepository.listRoleByNames(request.getRoles());
            account.setRoles(roles);
        }
        accountRepository.save(account);
    }
}
