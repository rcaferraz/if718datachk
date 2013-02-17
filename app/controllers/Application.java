package controllers;

import play.*;
import play.data.*;
import play.mvc.*;

import views.html.*;

import models.*;

public class Application extends Controller {
  
	static Form<Computador> computadorForm = Form.form(Computador.class);

//    public static Result index() {
//        return ok(index.render("Your new application is ready."));
//    }
  
	public static Result index() {
		return redirect(routes.Application.computadores());
	}

	public static Result computadores() {
		return ok(
			views.html.lista.render(Computador.all(), computadorForm)
			);
	}

	public static Result newComputador() {
		return TODO;
	}

	public static Result deleteComputador(Long id) {
		return TODO;
	}

}
