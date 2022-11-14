package shop.reav.reavproj.controller;

import shop.reav.reavproj.dto.ReavDto;
import shop.reav.reavproj.service.ReavService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReavController {

	private final ReavService reavService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Object test() {
		return "Hello World!!!";
	}

	@RequestMapping(value = "/review", method = RequestMethod.GET)
	public List<ReavDto> getReview() {
		return reavService.getReviewList();
	}
}