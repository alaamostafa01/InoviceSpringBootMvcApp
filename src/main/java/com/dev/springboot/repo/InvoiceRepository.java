package com.dev.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.springboot.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

}
