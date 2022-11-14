package shop.reav.reavproj.mapper;

import shop.reav.reavproj.dto.ReavDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReavMapper {
    List<ReavDto> getReviewList();
}