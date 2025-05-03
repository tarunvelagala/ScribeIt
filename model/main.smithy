namespace com.scribeit

service ScribeItService {
    version: "2.0"
    operations: [
        GetScribeById
    ]
    errors: [
        ScribeNotFound
    ]
}

/// Documentation about a structure.
structure Scribe {
    /// Documentation about a member.
    @required
    id: String
}

@readonly
@http(method: "GET", uri: "/scribes/{id}")
operation GetScribeById {
    input: GetScribeByIdInput
    output: GetScribeByIdOutput
    errors: [
        ScribeNotFound
    ]
}

structure GetScribeByIdInput {
    @httpLabel
    @required
    id: String
}

structure GetScribeByIdOutput {
    scribe: Scribe
}

@error("client")
structure ScribeNotFound {
    message: String
}
