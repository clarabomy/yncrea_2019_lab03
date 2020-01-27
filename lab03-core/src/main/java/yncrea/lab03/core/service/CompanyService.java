package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.BusinessTypeRepository;
import yncrea.lab03.core.dao.CompanyRepository;
import yncrea.lab03.core.entity.Company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CompanyService {
    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void deleteAll() {
        companyRepository.deleteAll();
    }


    public void save(final Company company) {
        companyRepository.save(company);
    }


    public long countAll() {
        return companyRepository.count();
    }


    public Map<String, Integer> getAllWithProjectCount() {
        Map<String, Integer> allWithProjectCount = new HashMap<>();
        List<Company> companies = (List<Company>)companyRepository.findAll();
        companies.forEach(company -> {
            allWithProjectCount.put(company.getName(), company.getProjects().size());
        });

        /*for (Company company: companies) {
            final int nbProjects = company.getProjects().size();
            allWithProjectCount.put(company.getName(), nbProjects);
        }

        companyRepository.findAll().stream().collect(
            Collectors.toMap(Company::getName, c -> c.getProjects().size()));

        @Query("SELECT DISTINCT c FROM Company c LEFT JOIN FETCH c.projects")

        */
       return allWithProjectCount;
    }
}
