package arnab.character.count;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CharacterCountFrontendService {
	
	public String getCount(String stringValue) {
		RestTemplate rest = new RestTemplate();
		String value = rest.getForObject("http://string-count-backend.local:8080/stringCount/getgetcount?value=" + stringValue, String.class);
		return value;
	}
	
}
