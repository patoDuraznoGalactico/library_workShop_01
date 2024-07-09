package com.riwi.library.infrastructure.services;

import com.riwi.library.api.dto.requests.LoanRequest;
import com.riwi.library.api.dto.response.LoanResponse;
import com.riwi.library.infrastructure.abstract_services.ILoanService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LoanService implements ILoanService {
    @Override
    public LoanResponse create(LoanRequest request) {
        return null;
    }

    @Override
    public LoanResponse get(Long aLong) {
        return null;
    }

    @Override
    public LoanResponse update(LoanRequest request, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Page<LoanResponse> getAll(int page, int size) {
        return null;
    }
}
