package com.protfolio.protfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.protfolio.protfolio.entity.UserMessgesEntity;

import jakarta.persistence.Id;

@Repository
public interface  UserMessgesRepository extends JpaRepository <UserMessgesEntity,Integer> {

}
