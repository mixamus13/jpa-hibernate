package edu.jpa.service;

import edu.jpa.entity.Company;

import javax.persistence.EntityManagerFactory;

public class CompanyService {
    private static EntityManagerFactory emf = null;

    static {
        emf = null; // create EntityManagerFactory instance here
        init();
    }

    public Company getCompany(int id) {
        return null;
    }

    public void saveCompany(Company company) {
    }

    private static void init() {
    }
}
