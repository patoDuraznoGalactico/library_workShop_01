package com.riwi.library.infrastructure.abstract_services;

import com.riwi.library.api.dto.requests.LoanRequest;
import com.riwi.library.api.dto.response.LoanResponse;

public interface ILoanService extends CrudService<LoanRequest, LoanResponse, Long>{
}
