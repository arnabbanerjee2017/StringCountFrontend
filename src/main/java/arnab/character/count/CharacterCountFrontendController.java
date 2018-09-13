package arnab.character.count;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stringcount")
public class CharacterCountFrontendController {

	@Autowired
	CharacterCountFrontendService service;
	
	@GetMapping("/getcount")
	public String getCount(@PathParam("value") String value) {
		return service.getCount(value);
	}
	
}
