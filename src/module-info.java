module workshop {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	opens application to javafx.graphics, javafx.fxml, javafx.base;
	
	exports gui;
	opens gui to javafx.fxml;	
	
	 opens model.entities to javafx.graphics, javafx.fxml, javafx.base;
     opens model.services to javafx.graphics, javafx.fxml;
}
