package cursoweb.test;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")

public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@GetMapping("/api/postres/list")
	public ArrayList<Postres> calling() {
		ArrayList<Postres> desserts = new ArrayList<>();
		desserts.add(new Postres("1", "Flan", "3.00 €", "https://i.ibb.co/YpQtZnZ/Flan-id1.png",
				"El flan de huevo es un postre perfecto para fiestas infantiles o celebraciones familiares. Nuestro flan de huevo artesano de toda la vida,  con su base de caramelo, para que disfrutes con el sabor tradicional de la receta de la abuela, elaborado a base de leche fresca, azucar , huevo , raspadura de limón y canela en rama."));
		desserts.add(new Postres("2", "Macedonia", "3.90 €", "https://i.ibb.co/n1qVKKc/Macedonia-id2.png",
				"Nuestra ensalada de frutas es ideal para verano, hecha con fruta fresca de proximidad. Hidratan, refrescan y aportan múltiples vitaminas y minerales, con muchos beneficios para el organismo. Regulan la función intestinal, por la riqueza en fibra. Elaborado a base de Agua, zumo de naranja y limón, azucar, manzana, melocotón, kiwui, frambuesas, "));
		desserts.add(new Postres("3", "Tarta Chocolate", "5.00 €", "https://i.ibb.co/bv8pP0J/Tortachocolate-id3.png",
				"Esponjosa tarta de chocolate con finas capas de inteno sabor. La tarta de chocolate o torta de chocolate, es un postre típico en reuniones, cumpleaños y bodas. Elaborado a base de harina, levadura, huevos, leche, yogurt, azucar, cacao en polvo, aceite girasol, esencia de vainilla y sal."));
		desserts.add(new Postres("4", "Tiramisú", "4.00 €", "https://i.ibb.co/9gsW3vb/Tiramisu-id4.png",
				"Crujiente barra de pan de cereales hecha con masa madre y horneada al horno de piedra. El tiramisú es uno de los postres más populares del mundo. Es un plato dulce tradicional italiano, preparado con café, bizcocho, yemas de huevo, queso mascarpone, cacao y ron"));
		desserts.add(new Postres("5", "Pan de Centeno", "1.75 €", "https://i.ibb.co/vsVkgB2/pandecenteno-id5.png",
				"El pan de centeno contiene menos gluten que los otros y tiene un sabor ligeramente amargo. Está elaborado con la harina de centeno, la panificación muestra una miga más oscura que el pan de trigo. Ingredientes a base de agua, leche, melaza, sal y harinas de fuerza, trigo y centeno."));
		desserts.add(new Postres("6", "Helado de Vainilla", "3.25 €", "https://i.ibb.co/yqsDWpx/Heladovainillaid6.png",
				"Helado sin lactosa, más digestivo para personas con problemas de intolerancia. Elaborado a base de leche sin lactosa, yemas de huevo, azucar, nata sin lactosa, vainilla, galleta cereza confitada y caramelo líquido."));
		desserts.add(new Postres("7", "Cookies", "3.00 €", "https://i.ibb.co/55dy2jW/cookies-id7.png",
				"Crujientes galletas con pepitas de chocolate y suave aroma a vainilla. Elaborado a base de harina, levadura, huevos, azucar, mantequilla, esencia de vainilla y pepitas de chocolate."));
		desserts.add(new Postres("8", "Croissant", "2.50 €", "https://i.ibb.co/pf5Zp23/croissantid8.png",
				"Crujientes croissants rellenos de chocolate. Elaborado a base de harina, agua, mantequilla,chocolate, huevo, sal y azucar"));
		return desserts;
	}
	

}
