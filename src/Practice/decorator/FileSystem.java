package Practice.decorator;

// -------- Component --------
interface File {
    String displayInfo();
}

// -------- Concrete Component --------
class BasicFile implements File {
    @Override
    public String displayInfo() {
        return "File is saved";
    }
}

// -------- Abstract Decorator --------
abstract class FileDecorator implements File {
    protected File file;

    public FileDecorator(File file) {
        this.file = file;
    }
}

// -------- Concrete Decorators --------
class EncryptionDecorator extends FileDecorator {

    public EncryptionDecorator(File file) {
        super(file);
    }

    @Override
    public String displayInfo() {
        return file.displayInfo() + " | Encrypted";
    }
}

class CompressionDecorator extends FileDecorator {

    public CompressionDecorator(File file) {
        super(file);
    }

    @Override
    public String displayInfo() {
        return file.displayInfo() + " | Compressed";
    }
}

class LoggingDecorator extends FileDecorator {

    public LoggingDecorator(File file) {
        super(file);
    }

    @Override
    public String displayInfo() {
        return file.displayInfo() + " | Logged";
    }
}

// -------- Client --------
public class FileSystem {

    public static void main(String[] args) {

        // Basic file
        File file = new BasicFile();
        System.out.println(file.displayInfo());

        // Add compression
        file = new CompressionDecorator(file);
        System.out.println(file.displayInfo());

        // Add encryption
        file = new EncryptionDecorator(file);
        System.out.println(file.displayInfo());

        // Add logging
        file = new LoggingDecorator(file);
        System.out.println(file.displayInfo());

        // Multiple decorators at once
        File secureFile =
                new LoggingDecorator(
                        new EncryptionDecorator(
                                new CompressionDecorator(
                                        new BasicFile()
                                )
                        )
                );

        System.out.println(secureFile.displayInfo());
    }
}
