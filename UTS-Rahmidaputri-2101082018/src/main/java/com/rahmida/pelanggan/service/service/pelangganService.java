/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rahmida.pelanggan.service.service;

import com.rahmida.pelanggan.service.entity.Pelanggan;
import com.rahmida.pelanggan.service.entity.pelanggan;
import com.rahmida.pelanggan.service.repository.PelangganRepository;
import com.rahmida.pelanggan.service.repository.pelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author asus
 */
@Service
public class pelangganService {
    @Autowired
    private pelangganRepository pelangganRepository;

    public pelanggan savepelanggan(pelanggan pelanggan){
        return pelangganRepository.save(pelanggan);
    }

    public pelanggan findpelangganById(Long pelangganId){
        return pelangganRepository.findBypelangganId(pelangganId);
    }
}