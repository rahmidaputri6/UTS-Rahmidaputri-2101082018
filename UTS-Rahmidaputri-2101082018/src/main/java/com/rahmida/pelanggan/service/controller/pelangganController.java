/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rahmida.pelanggan.service.controller;

import com.rahmida.pelanggan.service.entity.pelanggan;
import com.rahmida.pelanggan.service.service.PelangganService;
import com.rahmida.pelanggan.service.service.pelangganService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asus
 */
@RestController
@RequestMapping("/pelanggan")
public class pelangganController {
     @Autowired
    private pelangganService pelangganService;

    @PostMapping("/")
    public pelanggan savepelanggan(@RequestBody pelanggan pelanggan){
        return pelangganService.savepelanggan(pelanggan);
    }

    @GetMapping("/{id}")
    public pelanggan findpelangganById(@PathVariable("id") Long pelangganId){
        return pelangganService.findpelangganById(pelangganId);
    }
}