package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Mukda Boonprajan!");
        model.addAttribute("studentId", "673380598-1");
        return "home"; // ไม่ใช่ path ไฟล์ แค่ "ชื่อ view" เชิงตรรกะเท่านั้น
    }

    @GetMapping("/about")
    public String about(Model model) {
    model.addAttribute("message", "สวัสดีค่ะ ฉันชื่อนางสาวมุกดา บุญประจันทร์ รหัสนักศึกษา 6733805981 เป็นนักศึกษาวิทยาการคอมพิวเตอร์ชั้นปีที่ 3 ที่มหาวิทยาลัยขอนแก่น");
    return "about";
    }
}