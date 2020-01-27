package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.BusinessTypeRepository;
import yncrea.lab03.core.entity.BusinessType;

@Service
@Transactional
public class BusinessTypeService {
    private BusinessTypeRepository businessTypeRepository;

    public BusinessTypeService(BusinessTypeRepository businessTypeRepository) {
        this.businessTypeRepository = businessTypeRepository;
    }

    public void deleteAll() {
        businessTypeRepository.deleteAll();
    }

    public void save(final BusinessType businessType) {
        businessTypeRepository.save(businessType);
    }

    public long countAll() {
        return businessTypeRepository.count();
    }
}
