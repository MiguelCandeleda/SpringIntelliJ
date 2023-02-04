package templates.Factura

import com.journaldev.spring.model.User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import java.text.DateFormat
import java.util.*


@Controller
class ControladorFactura {
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = ["/"], method = [RequestMethod.GET])
    fun home(locale: Locale, model: Model): String {
        println("Home Page Requested, locale = $locale")
        val date = Date()
        val dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale)
        val formattedDate = dateFormat.format(date)
        model.addAttribute("serverTime", formattedDate)
        return "home"
    }

    @RequestMapping(value = ["/user"], method = [RequestMethod.POST])
    fun user(@Validated user: User, model: Model): String {
        println("User Page Requested")
        model.addAttribute("userName", user.getUserName())
        return "user"
    }
}
