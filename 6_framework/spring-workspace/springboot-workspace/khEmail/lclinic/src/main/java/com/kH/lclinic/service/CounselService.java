package com.kH.lclinic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kH.lclinic.model.mapper.CounselMapper;
import com.kH.lclinic.model.vo.Counsel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CounselService {
   private final CounselMapper mapper;
   
   public List<Counsel> selectAllCounsel(String userId){
      return mapper.selectAllCounselByUserId(userId);
   }
}
