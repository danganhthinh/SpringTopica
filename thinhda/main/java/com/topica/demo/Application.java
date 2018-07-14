package com.topica.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.topica.model.Item;
import com.topica.model.Category;
import com.topica.service.CategoryService;
import com.topica.service.ItemService;

/**
 *
 * @author thinh
 */
@SpringBootApplication(scanBasePackages = {"service", "model", "repository"})
@EnableJpaRepositories("repository")
@EntityScan("model")
public class Application implements CommandLineRunner {

    @Autowired
    private CategoryService categorySv;

    @Autowired
    private ItemService itemSv;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Item> items = itemSv.findByCategory("hghg", 0, 2);
        List<Category> categories = categorySv.findByType("fghg", 0, 1);

        for (Item item : items) {
            System.out.println(item.getId() + ": " + item.getName());
        }

        System.out.println("categories: " + categories.size());
        for (Category category : categories) {
            System.out.println(category.getId() + ": " + category.getName());
        }
    }

}
