/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rahmida.pelanggan.service.repository;

import com.rahmida.pelanggan.service.entity.pelanggan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author asus
 */
@Repository
public interface pelangganRepository extends JpaRepository<pelanggan, Long> {

    public pelanggan findBypelangganId(Long pelangganId);

}