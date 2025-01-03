module com.ss.studysystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires password4j;
    requires Java.WebSocket;
    requires one.jpro.platform.mdfx;
    requires org.apache.commons.io;
    requires org.slf4j;
    requires javafx.web;
    requires org.fxmisc.richtext;
    requires org.apache.commons.imaging;
    requires java.desktop;
    requires net.sourceforge.plantuml;

    opens com.ss.studysystem.controller to javafx.fxml;
    exports com.ss.studysystem.controller;
    opens com.ss.studysystem to javafx.fxml;
    exports com.ss.studysystem;
    exports com.ss.studysystem.database.connection;
    opens com.ss.studysystem.database.connection to javafx.fxml;
    exports com.ss.studysystem.database.controller;
    opens com.ss.studysystem.database.controller to javafx.fxml;
    exports com.ss.studysystem.Model;
    opens com.ss.studysystem.Model to javafx.fxml;
    exports com.ss.studysystem.controller.chat;
    opens com.ss.studysystem.controller.chat to javafx.fxml;
    exports com.ss.studysystem.controller.survey;
    opens com.ss.studysystem.controller.survey to javafx.fxml;
    exports com.ss.studysystem.controller.classroom;
    opens com.ss.studysystem.controller.classroom to javafx.fxml;
    exports com.ss.studysystem.controller.hello;
    opens com.ss.studysystem.controller.hello to javafx.fxml;
    exports com.ss.studysystem.controller.to_do_list;
    opens com.ss.studysystem.controller.to_do_list to javafx.fxml;
    exports com.ss.studysystem.controller.image_editor;
    opens com.ss.studysystem.controller.image_editor to javafx.fxml;
    exports com.ss.studysystem.scrap;
    opens com.ss.studysystem.scrap to javafx.fxml;
    exports com.ss.studysystem.UI.utils;
    opens com.ss.studysystem.UI.utils to java.desktop;
}