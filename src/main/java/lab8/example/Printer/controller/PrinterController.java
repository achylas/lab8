package lab8.example.Printer.controller;

import lab8.example.Printer.service.PrinterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/printer")
public class PrinterController {

    private final PrinterService printer;

    // Injecting Singleton Printer
    public PrinterController(PrinterService printer) {
        this.printer = printer;
    }

    @PostMapping("/print")
    public String print(@RequestParam String message) {
        printer.printMessage(message);
        return "Message printed: " + message;
    }
}
