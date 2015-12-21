package forwardexample

class ExampleController {

    def home() {
        log.debug("Home")
        render("Home: $params")
    }

    def refer() {
        log.debug("Link should be: ${createLink(controller: 'example', action: 'home', params: [code: params.code])}")
        forward(controller: 'example', action: 'home', params: [code: params.code])
    }

}
