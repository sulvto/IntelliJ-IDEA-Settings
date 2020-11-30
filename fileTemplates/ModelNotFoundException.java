package ${PACKAGE_NAME};

#parse("File Header.java")
public class ${NAME}NotFoundException extends Exception {

    public ${NAME}NotFoundException (String message) {
        super(message);
    }
}
