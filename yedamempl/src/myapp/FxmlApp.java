package myapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("AnchorPane.fxml")); // Label, Button // getClass 현재 클래스 로드
		//Parent 뒤에 오는 VBox,AnchorPane 이든 상관없이 다 호출 가능

		// 컨테이너를 Scene의 매개값으로.
		Scene scene = new Scene(root);

		// Stage의 매개값으로 scene 닫아줌.
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args); //Application.launch(메인메소드 매개변수)
	}

}
