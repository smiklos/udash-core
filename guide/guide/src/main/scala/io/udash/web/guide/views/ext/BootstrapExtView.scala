package io.udash.web.guide.views.ext

import io.udash._
import io.udash.web.commons.components.CodeBlock
import io.udash.web.guide._
import io.udash.web.guide.components.ForceBootstrap
import io.udash.web.guide.styles.partials.GuideStyles
import io.udash.web.guide.views.ext.demo.BootstrapDemos
import io.udash.web.guide.views.ext.demo.bootstrap._
import io.udash.web.guide.views.{References, Versions}
import scalatags.JsDom

case object BootstrapExtViewFactory extends StaticViewFactory[BootstrapExtState.type](() => new BootstrapExtView)


class BootstrapExtView extends FinalView {
  import JsDom.all._

  private val (staticsDemo, staticsSnippet) = StaticsDemo.demoWithSnippet()
  private val (iconsDemo, iconsSnippet) = IconsDemo.demoWithSnippet()
  private val (datePickerDemo, datePickerSnippet) = DatePickerDemo.demoWithSnippet()
  private val (dateRangePickerDemo, dateRangePickerSnippet) = DateRangePickerDemo.demoWithSnippet()
  private val (tableDemo, tableSnippet) = TableDemo.demoWithSnippet()
  private val (dropdownsDemo, dropdownsSnippet) = DropdownsDemo.demoWithSnippet()
  private val (buttonsDemo, buttonsSnippet) = ButtonsDemo.demoWithSnippet()
  private val (toggleButtonsDemo, toggleButtonsSnippet) = ToggleButtonsDemo.demoWithSnippet()
  private val (staticButtonsGroupDemo, staticButtonsGroupSnippet) = StaticButtonsGroupDemo.demoWithSnippet()
  private val (buttonToolbarDemo, buttonToolbarSnippet) = ButtonToolbarDemo.demoWithSnippet()
  private val (checkboxButtonsDemo, checkboxButtonsSnippet) = CheckboxButtonsDemo.demoWithSnippet()
  private val (radioButtonsDemo, radioButtonsSnippet) = RadioButtonsDemo.demoWithSnippet()
  private val (buttonDropdownDemo, buttonDropdownSnippet) = ButtonDropdownDemo.demoWithSnippet()
  private val (inputGroupDemo, inputGroupSnippet) = InputGroupDemo.demoWithSnippet()
  private val (simpleFormDemo, simpleFormSnippet) = SimpleFormDemo.demoWithSnippet()
  private val (inlineFormDemo, inlineFormSnippet) = InlineFormDemo.demoWithSnippet()
  private val (navsDemo, navsSnippet) = NavsDemo.demoWithSnippet()
  private val (navbarDemo, navbarSnippet) = NavbarDemo.demoWithSnippet()
  private val (navigationDemo, navigationSnippet) = UdashNavigationDemo.demoWithSnippet()
  private val (breadcrumbsDemo, breadcrumbsSnippet) = BreadcrumbsDemo.demoWithSnippet()
  private val (paginationDemo, paginationSnippet) = PaginationDemo.demoWithSnippet()
  private val (labelsDemo, labelsSnippet) = LabelsDemo.demoWithSnippet()
  private val (badgesDemo, badgesSnippet) = BadgesDemo.demoWithSnippet()
  private val (jumbotronDemo, jumbotronSnippet) = JumbotronDemo.demoWithSnippet()
  private val (alertsDemo, alertsSnippet) = AlertsDemo.demoWithSnippet()
  private val (progressBarDemo, progressBarSnippet) = ProgressBarDemo.demoWithSnippet()
  private val (listGroupDemo, listGroupSnippet) = ListGroupDemo.demoWithSnippet()
  private val (cardsDemo, cardsSnippet) = CardsDemo.demoWithSnippet()
  private val (responsiveEmbedDemo, responsiveEmbedSnippet) = ResponsiveEmbedDemo.demoWithSnippet()

  override def getTemplate: Modifier = div(
    h1("Udash Bootstrap Components"),
    h2("First steps"),
    p("To start development with the Bootstrap wrapper add the following line in you frontend module dependencies: "),
    CodeBlock(
      s""""io.udash" %%% "udash-bootstrap" % "${Versions.udashVersion}"""".stripMargin
    )(GuideStyles),
    p("The wrapper provides a typed equivalent of the ", a(href := References.BootstrapHomepage)("Twitter Bootstrap"), " API."),
    h2("Statics"),
    p(
      "All Bootstrap tags and styles are available as UdashCSS styles. If you want to use ",
      i("BootstrapStyles"), " import ", i("io.udash.css.CssView._"), ". It enables implicit conversion ",
      "from these styles into Scalatags modifiers."
    ),
    staticsSnippet,
    ForceBootstrap(staticsDemo),
    h2("Components"),
    p("The ", i("UdashBootstrapComponent"), " hierarchy enables you to seamlessly use Bootstrap components and integrate ",
      "them with your Udash app, both in a completely type-safe way."),
    h3("Glyphicons & FontAwesome"),
    p("The icons from ", i("Glyphicons"), " and ", i("FontAwesome"), " packages are accessible in ", i("Icons"), " object."),
    iconsSnippet,
    ForceBootstrap(iconsDemo),
    h3("Date Picker"),
    datePickerSnippet,
    ForceBootstrap(datePickerDemo),
    p("It is possible to create a date range selector from two pickers."),
    dateRangePickerSnippet,
    ForceBootstrap(dateRangePickerDemo),
    h3("Tables"),
    tableSnippet,
    ForceBootstrap(tableDemo),
    h3("Dropdowns"),
    p("You can create dynamic dropdowns using ", i("SeqProperty"), "-based ", i("UdashDropdown"),
      ". It allows listening on item selection and using custom item renderers."),
    p("The example below shows a simple dropup using default renderer and item styles. A new item is added every 5 seconds, ",
      "item selections are recorded and displayed underneath."),
    dropdownsSnippet,
    ForceBootstrap(dropdownsDemo),
    h3("Button"),
    p("Bootstrap buttons are easy to use as ", i("UdashButton"), "s. They support click listening, ",
      "provide type-safe style & size classes and a ", i("Property"), "-based mechanism for activation and disabling."),
    p("This example shows a variety of available button options. Small button indicators register their clicks and are ",
      "randomly set as active or disabled by the block button action, which also clears the click history."),
    buttonsSnippet,
    ForceBootstrap(buttonsDemo),
    p("The example below presents helper method for creating toggle buttons."),
    toggleButtonsSnippet,
    ForceBootstrap(toggleButtonsDemo),
    h3("Button groups"),
    p("There are many ways of creating a button group. The first example presents static API usage:"),
    staticButtonsGroupSnippet,
    ForceBootstrap(staticButtonsGroupDemo),
    p("It is also possible to create reactive groups and toolbars:"),
    buttonToolbarSnippet,
    ForceBootstrap(buttonToolbarDemo),
    p("Use ", i("checkboxes"), " method in order to create a group of buttons behaving as checkboxes:"),
    checkboxButtonsSnippet,
    ForceBootstrap(checkboxButtonsDemo),
    p("The following example presents a group of buttons behaving as radio buttons:"),
    radioButtonsSnippet,
    ForceBootstrap(radioButtonsDemo),
    h3("Button dropdowns"),
    p("The ", i("UdashDropdown"), " component can be used as part of a button group."),
    buttonDropdownSnippet,
    ForceBootstrap(buttonDropdownDemo),
    h3("Input groups"),
    p(
      i("UdashInputGroup"), " groups input elements into one component. It also provides convinient methods for creating the elements structure: ",
      i("input"), " for wrapping input elements, ", i("addon"), " for text elements and ", i("buttons"), " buttons."
    ),
    inputGroupSnippet,
    ForceBootstrap(inputGroupDemo),
    h3("Forms"),
    p(i("UdashForm"), " provides a lot of convenience methods for creating forms."),
    simpleFormSnippet,
    ForceBootstrap(simpleFormDemo),
    p("It is also possible to create an ", i("inline"), " or ", i("horizontal"), " form."),
    inlineFormSnippet,
    ForceBootstrap(inlineFormDemo),
    h3("Navs"),
    navsSnippet,
    ForceBootstrap(navsDemo),
    h3("Navbar"),
    navbarSnippet,
    ForceBootstrap(navbarDemo),
    p("The following example presents a navbar with a dropdown item. It uses menu of this guide."),
    navigationSnippet,
    ForceBootstrap(navigationDemo),
    h3("Breadcrumbs"),
    breadcrumbsSnippet,
    ForceBootstrap(breadcrumbsDemo),
    h3("Pagination"),
    paginationSnippet,
    ForceBootstrap(paginationDemo),
    h3("Labels"),
    labelsSnippet,
    ForceBootstrap(labelsDemo),
    h3("Badges"),
    badgesSnippet,
    ForceBootstrap(badgesDemo),
    h3("Jumbotron"),
    p("A lightweight, flexible component that can optionally extend the entire viewport to showcase key content on your site."),
    jumbotronSnippet,
    div(cls := "bootstrap")(jumbotronDemo),
    h3("Alerts"),
    p("The ", i("UdashAlert")," component supports both regular and dismissible Bootstrap alerts with type-safe styling and ",
      i("Property"), "-based dismissal mechanism."),
    alertsSnippet,
    ForceBootstrap(alertsDemo),
    h3("Progress bars"),
    p("The ", i("UdashProgressBar"), " component provides a simple way to use built-in Bootstrap progress bars ",
      "with custom stringifiers and ", i("Property"), "-controlled value, percentage showing and animation."),
    progressBarSnippet,
    ForceBootstrap(progressBarDemo),
    h3("List group"),
    listGroupSnippet,
    ForceBootstrap(listGroupDemo),
    h3("Card"),
    cardsSnippet,
    ForceBootstrap(cardsDemo),
    h3("Responsive embed"),
    responsiveEmbedSnippet,
    ForceBootstrap(responsiveEmbedDemo),
    h3("Modals"),
    p(
      "The modal window constructor takes three optional methods as the arguments. The first one is used to create ",
      "a modal window's header, the second creates a body and the last produces a window's footer."
    ),
    p(
      "The ", i("UdashModal"), " class exposes methods for opening/hiding window. It is also possible to listen on window's events."
    ),
    CodeBlock(
      s"""|val events = SeqProperty.blank[UdashModal.ModalEvent]
          |val header = (_: Binding.NestedInterceptor) => div("Modal events").render
          |val body = (nested: Binding.NestedInterceptor) => div(BootstrapStyles.Spacing.margin())(
          |  ul(nested(repeat(events)(event => li(event.get.toString).render)))
          |).render
          |val footer = (_: Binding.NestedInterceptor) => div(
          |  UdashButton()(_ => Seq[Modifier](UdashModal.CloseButtonAttr, "Close")).render,
          |  UdashButton(buttonStyle = BootstrapStyles.Color.Primary.toProperty)("Something...").render
          |).render
          |
          |val modal = UdashModal(modalSize = Some(BootstrapStyles.Size.Large).toProperty)(
          |  headerFactory = Some(header),
          |  bodyFactory = Some(body),
          |  footerFactory = Some(footer)
          |)
          |modal.listen { case ev => events.append(ev) }
          |
          |val openModalButton = UdashButton(buttonStyle = BootstrapStyles.Color.Primary.toProperty)("Show modal...")
          |openModalButton.listen { case UdashButton.ButtonClickEvent(_, _) =>
          |  modal.show()
          |}
          |val openAndCloseButton = UdashButton()("Open and close after 2 seconds...")
          |openAndCloseButton.listen { case UdashButton.ButtonClickEvent(_, _) =>
          |  modal.show()
          |  window.setTimeout(() => modal.hide(), 2000)
          |}
          |
          |div(
          |  modal.render,
          |  UdashButtonGroup()(
          |    openModalButton.render,
          |    openAndCloseButton.render
          |  ).render
          |).render""".stripMargin
    )(GuideStyles),
    ForceBootstrap(
      BootstrapDemos.simpleModal()
    ),
    h3("Tooltips"),
    CodeBlock(
      s"""|import scala.concurrent.duration.DurationInt
          |val tooltipContainerId = ComponentId("tooltip-container")
          |val label1 = UdashBadge()(_ => Seq[Modifier]("Tooltip on hover with delay", GlobalStyles.smallMargin)).render
          |UdashTooltip(
          |  trigger = Seq(UdashTooltip.Trigger.Hover),
          |  delay = UdashTooltip.Delay(500 millis, 250 millis),
          |  title = (_) => "Tooltip...",
          |  container = Option("#" + tooltipContainerId)
          |)(label1)
          |
          |val label2 = UdashBadge()(_ => Seq[Modifier]("Tooltip on click", GlobalStyles.smallMargin)).render
          |UdashTooltip(
          |  trigger = Seq(UdashTooltip.Trigger.Click),
          |  delay = UdashTooltip.Delay(0 millis, 250 millis),
          |  placement = (_, _) => Seq(UdashTooltip.Placement.Bottom),
          |  title = (_) => "Tooltip 2...",
          |  container = Option("#" + tooltipContainerId)
          |)(label2)
          |
          |val label3 = UdashBadge()(_ => Seq[Modifier]("Tooltip with JS toggler", GlobalStyles.smallMargin)).render
          |val label3Tooltip = UdashTooltip(
          |  trigger = Seq(UdashTooltip.Trigger.Manual),
          |  placement = (_, _) => Seq(UdashTooltip.Placement.Right),
          |  title = (_) => "Tooltip 3...",
          |  container = Option("#" + tooltipContainerId)
          |)(label3)
          |
          |val button = UdashButton()("Toggle tooltip")
          |button.listen { case _ => label3Tooltip.toggle() }
          |
          |div(id := tooltipContainerId)(
          |  label1, label2, label3, button.render
          |).render""".stripMargin
    )(GuideStyles),
    ForceBootstrap(
      BootstrapDemos.tooltips()
    ),
    h3("Popovers"),
    CodeBlock(
      s"""
         |import scala.concurrent.duration.DurationInt
         |val popoverContainerId = ComponentId("popover-container")
         |val label1 = UdashBadge()(_ => Seq[Modifier]("Popover on hover with delay", GlobalStyles.smallMargin)).render
         |UdashPopover(
         |  trigger = Seq(UdashPopover.Trigger.Hover),
         |  delay = UdashPopover.Delay(500 millis, 250 millis),
         |  title = (_) => "Popover...",
         |  content = (_) => "Content...",
         |  container = Option("#" + popoverContainerId)
         |)(label1)
         |val label2 = UdashBadge()(_ => Seq[Modifier]("Popover on click", GlobalStyles.smallMargin)).render
         |UdashPopover(
         |  trigger = Seq(UdashPopover.Trigger.Click),
         |  delay = UdashPopover.Delay(0 millis, 250 millis),
         |  placement = (_, _) => Seq(UdashPopover.Placement.Bottom),
         |  title = (_) => "Popover 2...",
         |  content = (_) => "Content...",
         |  container = Option("#" + popoverContainerId)
         |)(label2)
         |val label3 = UdashBadge()(_ => Seq[Modifier]("Popover with JS toggler", GlobalStyles.smallMargin)).render
         |val label3Tooltip = UdashPopover(
         |  trigger = Seq(UdashPopover.Trigger.Manual),
         |  placement = (_, _) => Seq(UdashPopover.Placement.Left),
         |  html = true,
         |  title = (_) => "Popover 3...",
         |  content = (_) => {
         |    import scalatags.Text.all._
         |    Seq(
         |      p("HTML content..."),
         |      ul(li("Item 1"), li("Item 2"), li("Item 3"))
         |    ).render
         |  },
         |  container = Option("#" + popoverContainerId)
         |)(label3)
         |
         |val button = UdashButton()("Toggle popover")
         |button.listen { case _ => label3Tooltip.toggle() }
         |
         |div(id := popoverContainerId)(
         |  label1, label2, label3, button.render
         |).render
       """.stripMargin
    )(GuideStyles),
    ForceBootstrap(
      BootstrapDemos.popovers()
    ),
    h3("Collapse"),
    p(
      i("UdashCollapse"), " represents element with toggle behaviour. It provides methods ",
      i("toggle"), ", ", i("open"), " and ", i("close"), " for manual manipulation and ",
      i("toggleButtonAttrs"), " for easy creation of toggle button."
    ),
    CodeBlock(
      s"""|val events = SeqProperty.blank[UdashCollapse.CollapseEvent]
          |val collapse = UdashCollapse()(
          |  div(wellStyles)(
          |    ul(repeat(events)(event => li(event.get.toString).render))
          |  )
          |)
          |collapse.listen { case ev => events.append(ev) }
          |val toggleButton = UdashButton(buttonStyle = BootstrapStyles.Color.Primary.toProperty)(
          |  _ => Seq[Modifier](collapse.toggleButtonAttrs(), "Toggle...")
          |)
          |val openAndCloseButton = UdashButton()("Open and close after 2 seconds...")
          |openAndCloseButton.listen { case _ =>
          |  collapse.show()
          |  window.setTimeout(() => collapse.hide(), 2000)
          |}
          |
          |div(
          |  UdashButtonGroup(justified = true.toProperty)(
          |    toggleButton.render,
          |    openAndCloseButton.render
          |  ).render,
          |  collapse.render
          |).render""".stripMargin
    )(GuideStyles),
    ForceBootstrap(
      BootstrapDemos.simpleCollapse()
    ),
    p(
      i("UdashAccordion"), " internally uses ", i("UdashCollapse"), ". It provides ",
      i("collapseOf"), " method for obtaining ", i("UdashCollapse"), " created for selected element."
    ),
    CodeBlock(
      s"""val events = SeqProperty.blank[UdashCollapse.CollapseEvent]
         |val news = SeqProperty[String](
         |  "Title 1", "Title 2", "Title 3"
         |)
         |
          |val accordion = UdashAccordion(news)(
         |  (news, _) => span(news.get).render,
         |  (_, _) => div(wellStyles)(ul(repeat(events)(event => li(event.get.toString).render))).render
         |)
         |
          |val accordionElement = accordion.render
         |news.elemProperties.map(accordion.collapseOf)
         |  .filter(_.isDefined)
         |  .foreach(_.get.listen { case ev => events.append(ev) })
         |div(accordionElement).render
       """.stripMargin
    )(GuideStyles),
    ForceBootstrap(
      BootstrapDemos.accordionCollapse()
    ),
    h3("Carousel"),
    p(
      i("UdashCarousel"), " is a slideshow component. It exposes its state (slides, current view) through ", i("Properties"),
      " and can be cycled through programatically."
    ),
    CodeBlock(
      s"""def newSlide(): UdashCarouselSlide = UdashCarouselSlide(
         |  Url("/assets/images/ext/bootstrap/carousel.jpg")
         |)(
         |  h3(randomString()),
         |  p(randomString())
         |)
         |val slides = SeqProperty[UdashCarouselSlide]((1 to 5).map(_ => newSlide()))
         |val active = Property(true)
         |import scala.concurrent.duration._
         |val carousel = UdashCarousel(
         |  slides = slides,
         |  activeSlide = Property(1),
         |  animationOptions = Property(AnimationOptions(interval = 2 seconds, keyboard = false, active = active.get))
         |) { case (slide, nested) => nested(produce(slide)(_.render)) }
         |val prevButton = UdashButton()("Prev")
         |val nextButton = UdashButton()("Next")
         |val prependButton = UdashButton()("Prepend")
         |val appendButton = UdashButton()("Append")
         |prevButton.listen { case _ => carousel.previousSlide() }
         |nextButton.listen { case _ => carousel.nextSlide() }
         |prependButton.listen { case _ => slides.prepend(newSlide()) }
         |appendButton.listen { case _ => slides.append(newSlide()) }
         |active.listen(b => if (b) carousel.cycle() else carousel.pause())
         |div(
         |  div(
         |    UdashButtonToolbar()(
         |      UdashButton.toggle(active = active)("Run animation").render,
         |      UdashButtonGroup()(
         |        prevButton.render,
         |        nextButton.render
         |      ).render,
         |      UdashButtonGroup()(
         |        prependButton.render,
         |        appendButton.render
         |      ).render
         |    ).render
         |  ),
         |  div(
         |    carousel.render
         |  )
         |).render""".stripMargin
    )(GuideStyles),
    ForceBootstrap(
      BootstrapDemos.carousel()
    ),
    h2("What's next?"),
    p("You can check the code for this page on our ", a(href := References.UdashGuideRepo)("GitHub repository"),
      ". It contains all the examples above and more, since UdashBootstrap is heavily used in the Udash Guide.")
  )
}