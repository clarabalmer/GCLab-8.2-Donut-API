package co.grandcircus.DonutLab;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DonutService {
	private RestTemplate restTemplate = new RestTemplate();
	
	public DonutResponse getAllDonuts() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		DonutResponse response = restTemplate.getForObject(url, DonutResponse.class);
		return response;
	}
	public Donut getOneDonut(int id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/{0}.json";
		Donut donut = restTemplate.getForObject(url, Donut.class, id);
		return donut;
	}
}
