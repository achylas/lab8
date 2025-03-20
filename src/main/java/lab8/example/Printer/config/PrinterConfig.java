package lab8.example.Printer.config;

import lab8.example.Printer.service.PrinterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public PrinterService printer() {
        return new PrinterService(); // Singleton instance
    }
}