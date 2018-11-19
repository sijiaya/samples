package com.soft1841.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;

public class HuoYingJiang extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //获取当前屏幕尺寸
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(screenSize.width + "  " + screenSize.height);
        //----设置标题
        primaryStage.setTitle("腾讯视频");
        //创建一个边界布局，上右下左
        BorderPane borderPane = new BorderPane();
        // 给外层的边界布局设置背景图
        BackgroundImage bg = new BackgroundImage(
                new Image("img/p0.jpg",
                        screenSize.width,
                        screenSize.height,
                        false, true),
                BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        //背景图设置给边界布局
        borderPane.setBackground(new Background(bg));
        //创建一个水平布局
        HBox hBox = new HBox();
        //设置一下水平布局中间各个组件（如各个按钮）之间的间距
        hBox.setSpacing(20);
        //设置水平布局和窗体之间的间距
        hBox.setPadding(new Insets(30, 20, 20, 10));
        //创建一个垂直布局
        VBox vBox = new VBox();
        //设置距离
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(50, 50, 50, 50));
        //创建网格布局
        GridPane gridPane = new GridPane();
        gridPane.setHgap(0);
        gridPane.setVgap(0);
        gridPane.setPadding(new Insets(5, 5, 5, 5));
        //创建按钮名称的字符串数组
        String[] buttonNames = {
                "\u2720为你精选", "\u2623电视剧", "\u2622电影", "\u2605VIP会员",
                "\u2702纪录片", "\u2660游戏", "\u2764综艺", "\u2623游戏", "\u266B音乐",
                "\u2708旅行", "\u2602天气"
        };
        //开始循环创建若干个按钮，并且设置样式添加到垂直布局中
        for (int i = 0; i < buttonNames.length; i++) {
            //循环创建按钮，并将数组中的元素作为按钮文字
            Button button = new Button(buttonNames[i]);
            button.setStyle("-fx-background-color: #ffffff;" +
                    "-fx-min-width: 63px;" +
                    "-fx-min-height: 37px;" + "-fx-text-fill:#efa100;-fx-font-size: 20");
            //把按钮加入到垂直布局中去
            vBox.getChildren().add(button);
        }
        //水平布局增加设置按钮
        Button setBtn = new Button("打开客户端");
        setBtn.setStyle("-fx-background-color:#3980ba ;" +
                "-fx-text-fill: #ffffff;" +
                "-fx-min-width: 10px;-fx-min-height:20px;");
        setBtn.setPadding(new Insets(10,30,10,30));
        hBox.getChildren().add(setBtn);
            setBtn.setOnAction(event -> {
            //创建新的舞台窗口
            Stage sencondStage = new Stage();
            Label label = new Label("If you fail, don't forget to learn your lesson.");
            label.setStyle("-fx-text-fill: #00449a;" + "-fx-font-size: 30px;" + "-fx-background-color:#c3ccff");
            Scene sencondScence = new Scene(label, 700, 500);
            sencondStage.setScene(sencondScence);
            sencondStage.show();
        });


        //加入一个日期
        DatePicker datePicker = new DatePicker();
        hBox.getChildren().add(datePicker);
        //将水平布局对象加入边界布局的顶部
        borderPane.setTop(hBox);
        //把按钮放在垂直布局
        borderPane.setLeft(vBox);
        //count就是图片编号，是一个变量
        int count = 1;
        //开始处理网格布局的行和列
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Image image = new Image("img/" + count + ".png");
                ImageView imageView = new ImageView(image);
                gridPane.add(imageView, j, i);
                imageView.setStyle("-fx-min-width: 300px;-fx-min-height:200px");
                count++;
            }
        }
        //
        //创建一个水平布局
        Image image2 = new Image("img/a1.png");
        ImageView imageView1 = new ImageView(image2);
        imageView1.setFitWidth(300);
        imageView1.setFitHeight(80);
        hBox.getChildren().add(imageView1);
        //将网格布局加入边界布局的中间
        borderPane.setCenter(gridPane);
        //----创建场景，并将边界加入场景
        Scene scene = new Scene(borderPane,800,500);
        //----将场景加入当前舞台
        primaryStage.setScene(scene);
        //----设置舞台可见
        primaryStage.show();

    }
            public static void main (String[]args){
                Application.launch(args);
            }
        }