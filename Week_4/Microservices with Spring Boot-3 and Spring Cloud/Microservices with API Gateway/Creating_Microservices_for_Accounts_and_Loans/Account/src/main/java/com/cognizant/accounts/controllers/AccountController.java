package com.cognizant.accounts.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.accounts.models.Accounts;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Accounts getAccount(@PathVariable String number) {

        return new Accounts(
                number,
                "savings",
                234343
        );
    }

}


