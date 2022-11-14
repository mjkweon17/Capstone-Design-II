package shop.reav.reavproj.service;

import shop.reav.reavproj.dto.ReavDto;
import shop.reav.reavproj.mapper.ReavMapper;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReavServiceImpl implements ReavService {

    private final ReavMapper reavMapper;

    @Override
    public List<ReavDto> getReviewList() {
        return reavMapper.getReviewList();
    }
}