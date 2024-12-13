package swagger.http.api.models.v2.swagger.json.get;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class Response {
	private String swagger;
	private Info info;
	private String basePath;
	private List<Tag> tags;
	private List<String> schemes;
	private Map<String, Path> paths;
	private Map<String, Definition> definitions;

	public String getSwagger() {
		return swagger;
	}

	public void setSwagger(String swagger) {
		this.swagger = swagger;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<String> getSchemes() {
		return schemes;
	}

	public void setSchemes(List<String> schemes) {
		this.schemes = schemes;
	}

	public Map<String, Path> getPaths() {
		return paths;
	}

	public void setPaths(Map<String, Path> paths) {
		this.paths = paths;
	}

	public Map<String, Definition> getDefinitions() {
		return definitions;
	}

	public void setDefinitions(Map<String, Definition> definitions) {
		this.definitions = definitions;
	}

	public static class Info {
		private String description;
		private String version;
		private String title;
		private String termsOfService;
		private Contact contact;
		private License license;

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTermsOfService() {
			return termsOfService;
		}

		public void setTermsOfService(String termsOfService) {
			this.termsOfService = termsOfService;
		}

		public Contact getContact() {
			return contact;
		}

		public void setContact(Contact contact) {
			this.contact = contact;
		}

		public License getLicense() {
			return license;
		}

		public void setLicense(License license) {
			this.license = license;
		}

		public static class Contact {
			private String email;

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}
		}

		public static class License {
			private String name;
			private String url;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}
	}

	public static class Tag {
		private String name;
		private String description;
		private ExternalDocs externalDocs;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public ExternalDocs getExternalDocs() {
			return externalDocs;
		}

		public void setExternalDocs(ExternalDocs externalDocs) {
			this.externalDocs = externalDocs;
		}

		public static class ExternalDocs {
			private String description;
			private String url;

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}
	}

	public static class Path {
		private Method get;
		private Method post;
		private Method put;
		private Method delete;

		public Method getGet() {
			return get;
		}

		public void setGet(Method get) {
			this.get = get;
		}

		public Method getPost() {
			return post;
		}

		public void setPost(Method post) {
			this.post = post;
		}

		public Method getPut() {
			return put;
		}

		public void setPut(Method put) {
			this.put = put;
		}

		public Method getDelete() {
			return delete;
		}

		public void setDelete(Method delete) {
			this.delete = delete;
		}

		public static class Method {
			private List<String> tags;
			private String summary;
			private String description;
			private String operationId;
			private List<String> consumes;
			private List<String> produces;
			private List<Parameter> parameters;
			private Map<String, ResponseData> responses;

			public List<String> getTags() {
				return tags;
			}

			public void setTags(List<String> tags) {
				this.tags = tags;
			}

			public String getSummary() {
				return summary;
			}

			public void setSummary(String summary) {
				this.summary = summary;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getOperationId() {
				return operationId;
			}

			public void setOperationId(String operationId) {
				this.operationId = operationId;
			}

			public List<String> getConsumes() {
				return consumes;
			}

			public void setConsumes(List<String> consumes) {
				this.consumes = consumes;
			}

			public List<String> getProduces() {
				return produces;
			}

			public void setProduces(List<String> produces) {
				this.produces = produces;
			}

			public List<Parameter> getParameters() {
				return parameters;
			}

			public void setParameters(List<Parameter> parameters) {
				this.parameters = parameters;
			}

			public Map<String, ResponseData> getResponses() {
				return responses;
			}

			public void setResponses(Map<String, ResponseData> responses) {
				this.responses = responses;
			}

			public static class Parameter {
				private String name;
				private In in;
				private String description;
				private boolean required;
				private String type;
				private String format;

				public String getName() {
					return name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public In getIn() {
					return in;
				}

				public void setIn(In in) {
					this.in = in;
				}

				public String getDescription() {
					return description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public boolean isRequired() {
					return required;
				}

				public void setRequired(boolean required) {
					this.required = required;
				}

				public String getType() {
					return type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getFormat() {
					return format;
				}

				public void setFormat(String format) {
					this.format = format;
				}
			}

			public static class ResponseData {
				private String description;
				private Schema schema;

				public String getDescription() {
					return description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public Schema getSchema() {
					return schema;
				}

				public void setSchema(Schema schema) {
					this.schema = schema;
				}

				public static class Schema {
					private String $ref;

					public String get$ref() {
						return $ref;
					}

					public void set$ref(String $ref) {
						this.$ref = $ref;
					}
				}
			}
		}
	}

	public static class Definition {
		private String type;
		private Map<String, Property> properties;
		private Xml xml;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Map<String, Property> getProperties() {
			return properties;
		}

		public void setProperties(Map<String, Property> properties) {
			this.properties = properties;
		}

		public Xml getXml() {
			return xml;
		}

		public void setXml(Xml xml) {
			this.xml = xml;
		}

		public static class Property {
			private String type;
			private String format;
			private String description;
			@SerializedName("enum")
			private List<String> enums;
			private String $ref;
			private String example;
			private Xml xml;

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getFormat() {
				return format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public List<String> getEnums() {
				return enums;
			}

			public void setEnums(List<String> enums) {
				this.enums = enums;
			}

			public String get$ref() {
				return $ref;
			}

			public void set$ref(String $ref) {
				this.$ref = $ref;
			}

			public String getExample() {
				return example;
			}

			public void setExample(String example) {
				this.example = example;
			}

			public Xml getXml() {
				return xml;
			}

			public void setXml(Xml xml) {
				this.xml = xml;
			}
		}
	}

	public enum In {
		path,
		formData
	}

	public static class Xml {
		private String name;
		private Boolean wrapped;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getWrapped() {
			return wrapped;
		}

		public void setWrapped(Boolean wrapped) {
			this.wrapped = wrapped;
		}
	}
}
