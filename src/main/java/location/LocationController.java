package location;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@Component
public class LocationController {
	
	/**
	 * Obtenir la liste des voitures à louer (tableau JSon)
	 * @return
	 */
	@RequestMapping(value = "/car", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Car> getVoitures(){
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("11AABB",5));
		cars.add(new Car("QQ44DD",3));
		return cars;
	}
	
	/**
	 * btenir les informations sur une voiture
	 * @param plaqueImmatriculation
	 * @return
	 */
	@RequestMapping(value = "/car/{immatriculation}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Car getVoiture(@PathVariable("immatriculation") String plaqueImmatriculation){
		return new Car("11AA22", 5);
	}
	
	/**
	 * louer une voiture ou retour location d'une voiture
	 * @param plaqueImmatriculation
	 * @param louer
	 * @throws Exception si mauvaise plaque immatriculation
	 */
	@RequestMapping(value = "/car/{immatriculation}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void locationEtRetour(@PathVariable("immatriculation") String plaqueImmatriculation, @RequestParam(value="louer", required = false)boolean louer) throws Exception{
		
	}

}
