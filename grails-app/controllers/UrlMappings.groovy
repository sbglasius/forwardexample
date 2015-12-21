class UrlMappings {

    static mappings = {
        "/refer/$code?"(controller: 'example', action: 'refer')
        "/"(controller: 'example', action: 'home')
//        "/$controller/$action?/$id?(.$format)?"() {
//            constraints {
//            }
//        }

//        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
