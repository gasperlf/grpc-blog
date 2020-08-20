# gRPC-blog

Example API using gRPC

# Dependencies

Here in the GitHub you can find all information how to implement gRPC project
https://github.com/grpc/grpc-java

for reflection check 

https://github.com/grpc/grpc-java/blob/master/documentation/server-reflection-tutorial.md

### Evans gRPC CLI 

follow all instructions in https://github.com/ktr0731/evans

#### Connect to evans CLI

_`evans -r --host localhost -p 50051 repl`_

#### Show packages

_`blog.BlogService@localhost:50051> show package
 +-------------------------+
 |         PACKAGE         |
 +-------------------------+
 | blog                    |
 | grpc.reflection.v1alpha |
 +-------------------------+
 `_
 
#### Choose [api]
 
_`package blog`_

#### Show services
_`
blog@localhost:50051> show service
+-------------+------------+-------------------+--------------------+
|   SERVICE   |    RPC     |   REQUEST TYPE    |   RESPONSE TYPE    |
+-------------+------------+-------------------+--------------------+
| BlogService | CreateBlog | BlogCreateRequest | BlogCreateResponse |
| BlogService | ReadBlog   | BlogReadRequest   | BlogReadResponse   |
| BlogService | UpdateBlog | BlogUpdateRequest | BlogUpdateResponse |
| BlogService | DeleteBlog | BlogDeleteRequest | BlogDeleteResponse |
| BlogService | ListBlogs  | BlogListRequest   | BlogListResponse   |
+-------------+------------+-------------------+--------------------+
`_

#### Show messages
_`
blog@localhost:50051> show message
+--------------------+
|      MESSAGE       |
+--------------------+
| BlogCreateRequest  |
| BlogCreateResponse |
| BlogDeleteRequest  |
| BlogDeleteResponse |
| BlogListRequest    |
| BlogListResponse   |
| BlogReadRequest    |
| BlogReadResponse   |
| BlogUpdateRequest  |
| BlogUpdateResponse |
+--------------------+
`_

#### Calling endpoint 

_`blog@localhost:50051> service BlogService
blog.BlogService@localhost:50051> call ListBlogs
{
  "blog": {
    "id": "5f383545354d3e4d0a532d23",
    "author_id": "Lewis FLorez",
    "title": "Hello updated",
    "content": "Hello, my first call grpc"
  }
}
{
  "blog": {
    "id": "5f3835a13b0f1b5b7ccc8da0",
    "author_id": "Lewis FLorez",
    "title": "Hello",
    "content": "Hello, my first call grpc"
  }
}
{
  "blog": {
    "id": "5f38595e3b0f1b5b7ccc8da1",
    "author_id": "Sarher Jimenez",
    "title": "Travelers in Spain",
    "content": "New document about traveles in Spain"
  }
}`_

# Tools

**BloomRPC**
It is like Postman to call server endpoints

follow instruction to install in your machine in

https://github.com/uw-labs/bloomrpc



