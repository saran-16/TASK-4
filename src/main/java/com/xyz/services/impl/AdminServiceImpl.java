package com.xyz.services.impl;

import com.xyz.models.Role;
import com.xyz.util.ValueMapper;
import com.xyz.dto.AdminDto;

//import com.xyz.repositories.AdminRepository;
import com.xyz.services.AdminService;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {


    @Override
    public AdminDto create(AdminDto adminDto) {
      //  KafkaProperties.Admin admin = this.valueMapper.modelMapper().map(adminDto, Admin.class);
      //  admin.setRole(Role.ROLE_ADMIN.toString());
     //   this.adminRepository.save(admin);
        return null;
    }

    @Override
    public AdminDto update(AdminDto adminDto, Integer id) {
        //KafkaProperties.Admin admin = this.adminRepository.findById(id)
            //    .orElseThrow(
                    //    () -> new ResourceNotFoundException("Admin not found ID: " + id)
             //   );
      //  admin.setEmail(adminDto.getEmail());
      //  admin.setName(adminDto.getName());
       // admin.setPassword(admin.getPassword());
        //this.adminRepository.save(admin);
        return null;
    }

    @Override
    public AdminDto getById(Integer id) {
        /*
        Admin admin = this.adminRepository.findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Admin not found ID: " + id)
                );
        return this.valueMapper.modelMapper().map(admin, AdminDto.class);

         */
        return null;
    }

    @Override
    public void delete(Integer id) {
        /*
        Admin admin = this.adminRepository.findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Admin not found ID: " + id)
                );
        this.adminRepository.delete(admin);
        */

    }
}
