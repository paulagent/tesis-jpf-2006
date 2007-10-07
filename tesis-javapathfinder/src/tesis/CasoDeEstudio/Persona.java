package tesis.CasoDeEstudio;

class Persona implements Runnable {
	private String id;
	private String tabifier;
	private ControladorAscensor controlador;

	Persona (String id) {
		this.id = id;
	}

	public void controlador(ControladorAscensor c) {
		controlador = c;
	}

	public synchronized void run() {
		Ascensor[] as = controlador.ascensores();

		if (id == "p1") {
			controlador.solicitudAscensor(as[0], 5);
			esperar(1);
			controlador.solicitudAscensor(as[0], 2);
			esperar(1);
			controlador.solicitudAscensor(as[0], 6);
		}

		if (id == "p2") {
			controlador.solicitudAscensor(as[0], 1);
			esperar(1);
			controlador.solicitudAscensor(as[0], 3);
			esperar(1);
			controlador.solicitudAscensor(as[0], 9);
		}
	}

	// Helper
	private void msgs(String s) {
		System.out.println(tabifier+"Persona "+id+" -> " + s);
	}

	public void setTab(String s) {
		tabifier = s;
	}

	private void esperar (int seg) {
		try {
			Thread.sleep(seg*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}