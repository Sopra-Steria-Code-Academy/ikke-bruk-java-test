
resource "azurerm_resource_group" "main" {
  name     = "${var.rg_name}-${var.environment}"
  location = var.rg_location
  tags = {
    "cost_center"        = "code"
    "deployment_type"    = "terraform"
    "environment"        = var.environment
    "owner"              = "per.hoff_soprasteria.com#ext#@hydrorein.onmicrosoft.com"
    "product_version"    = "latest"
    "rightcloud_product" = "environment"
  }
}
