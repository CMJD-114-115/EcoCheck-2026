package lk.ijse.cmjd114_115.EcoCheck2026.service.impl;

import lk.ijse.cmjd114_115.EcoCheck2026.dto.ActionCategoryDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.UserDTO;
import lk.ijse.cmjd114_115.EcoCheck2026.dto.enums.Role;
import lk.ijse.cmjd114_115.EcoCheck2026.service.ActionCategoryService;
import lk.ijse.cmjd114_115.EcoCheck2026.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionCategoryIMPL implements ActionCategoryService {

    @Override
    public void saveActionCategory(ActionCategoryDTO actionCategory) {
        System.out.println("Action Category is: " + actionCategory.toString());
    }

    @Override
    public ActionCategoryDTO getSelectedActionCategory(String actionCategoryId) {
        System.out.println("Selected User: " + actionCategoryId);
        return new ActionCategoryDTO(
                "AC-005",
                "Transport",
                "Transportation related climate actions");
    }

    @Override
    public List<ActionCategoryDTO> getAllActionCategories() {
        List<ActionCategoryDTO> userList = List.of(
                new ActionCategoryDTO(
                        "AC-001",
                        "Energy Saving",
                        "Actions related to reducing electricity and fuel consumption"
                ),
                new ActionCategoryDTO(
                        "AC-002",
                        "Waste Management",
                        "Actions related to waste reduction, recycling, and composting"
                ),
                new ActionCategoryDTO(
                        "AC-003",
                        "Tree Planting",
                        "Actions related to afforestation and increasing green cover"
                ),
                new ActionCategoryDTO(
                        "AC-004",
                        "Water Conservation",
                        "Actions related to reducing water usage and improving efficiency"
                ));
        return  userList;
    }

    @Override
    public void updateActionCategory(String actionCategoryId, ActionCategoryDTO actionCategory) {
        System.out.println("Updated action category id is " + actionCategoryId +" as: " + actionCategory.toString());

    }

    @Override
    public void deleteActionCategory(String actionCategoryId) {
        System.out.println("Deleted User id is " + actionCategoryId);
    }
}
