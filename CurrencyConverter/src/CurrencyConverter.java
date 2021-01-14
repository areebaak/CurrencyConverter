import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

	public class CurrencyConverter extends Application{

	public static void main(String[] args) {
	launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub

	Label l=new Label("Currency Converter");
	l.setFont(Font.font(STYLESHEET_CASPIAN,FontWeight.EXTRA_BOLD, 24));
	l.setTextFill(Color.BLACK);
	
	Label l1 = new Label("Enter Amount To convert");
	TextField t1=new TextField();

	Label l2 = new Label("From");
	ComboBox<String> cmb=new ComboBox<String>();
	cmb.getItems().addAll("USD","PKR","EURO","AED");
	cmb.setPromptText("Select");

	Label l3 = new Label("To");
	ComboBox<String> cmb1 = new ComboBox<String>();
	cmb1.getItems().addAll("USD","PKR","EURO","AED");
	cmb1.setPromptText("Select");

	Button b1 = new Button("Convert");

	GridPane grid = new GridPane();
	Scene s = new Scene(grid,500,500);
	grid.setHgap(10);
	grid.setVgap(10);
	grid.setAlignment(Pos.CENTER);
	b1.setAlignment(Pos.BOTTOM_CENTER);
	
	grid.add(l, 1, 0);
	grid.add(l1, 1, 1);
	grid.add(t1, 1, 2);
	grid.add(l2, 1, 3);
	grid.add(l3, 2, 3);
	grid.add(cmb, 1, 4);
	grid.add(cmb1, 2, 4);
	grid.add(b1, 1, 5);
	final Text actiontarget = new Text();
	grid.add(actiontarget, 2, 6);

	primaryStage.setScene(s);
	primaryStage.show();

	b1.setOnAction(e->
	{
	actiontarget.setFill(Color.FIREBRICK);
	int inp = Integer.parseInt(t1.getText()) ;
	String FromConvert = cmb.getValue();
	String ToConvert = cmb1.getValue();

	if(FromConvert == "USD" && ToConvert == "PKR") {
	int out = inp*160;
	actiontarget.setText(Integer.toString(out));
	}else if(FromConvert == "USD" && ToConvert == "EURO") {
	int out =(int) (inp*0.8217);
	actiontarget.setText(Integer.toString(out));
	}else if(FromConvert == "USD" && ToConvert == "AED") {
	int out =(int) (inp*3.67);
	actiontarget.setText(Integer.toString(out));
	}else if(FromConvert == "PKR" && ToConvert == "USD") {
	int out =(int) (inp*0.0062);
	actiontarget.setText(Integer.toString(out));
	}else if(FromConvert == "PKR" && ToConvert == "EURO") {
	int out =(int) (inp*0.0051);
	actiontarget.setText(Integer.toString(out));
	}else if(FromConvert == "PKR" && ToConvert == "AED") {
	int out =(int) (inp*0.023);
	actiontarget.setText(Integer.toString(out));
	}else if(FromConvert == "AED" && ToConvert == "PKR") {
	int out = inp*43;
	actiontarget.setText(Integer.toString(out));
	}else if(FromConvert == "AED" && ToConvert == "USD") {
	int out =(int) (inp*0.27);
	actiontarget.setText(Integer.toString(out));
	}else if(FromConvert == "AED" && ToConvert == "EURO") {
	int out =(int) (inp*0.22);
	actiontarget.setText(Integer.toString(out));
	}else if(FromConvert == "EURO" && ToConvert == "PKR") {
	int out = inp*196;
	actiontarget.setText(Integer.toString(out));
	}else if(FromConvert == "EURO" && ToConvert == "USD") {
	int out =(int) (inp*1.22);
	actiontarget.setText(Integer.toString(out));
	}else if(FromConvert == "EURO" && ToConvert == "AED") {
	int out =(int) (inp*4.47);
	actiontarget.setText(Integer.toString(out));
	}
		
	});

	}
}
