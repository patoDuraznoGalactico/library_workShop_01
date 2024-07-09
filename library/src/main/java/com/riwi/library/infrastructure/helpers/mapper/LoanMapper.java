package com.riwi.library.infrastructure.helpers.mapper;


import com.riwi.library.api.dto.response.LoanBasicResponse;
import com.riwi.library.api.dto.response.LoanResponse;
import com.riwi.library.domain.entities.Loan;

import java.util.List;

public interface LoanMapper {
    LoanResponse toResponse(Loan loan);

    Loan toEntity(LoanResponse loanResponse);

    List<LoanBasicResponse> listToResponse(List<Loan> loans);
}
