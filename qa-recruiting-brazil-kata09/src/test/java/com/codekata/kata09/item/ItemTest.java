package com.codekata.kata09.item;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("An item")
public class ItemTest {

    @Nested
    @DisplayName("When comparing with another object")
    public class EqualsTest {

        @Test
        @DisplayName("Should indicate equality when the other object is identical")
        public void testWithIdenticalItems() {
            final Item item = new Item("ABC", 111);
            assertThat(item).isEqualTo(item);
        }

        @Test
        @DisplayName("Should indicate equality when the other item has the same SKU")
        public void testWithIdenticalSkuAndDifferentUnitPrice() {
            final Item left = new Item("ABC", 222);
            final Item right = new Item("ABC", 333);
            assertThat(left).isEqualTo(right);
        }

        @Test
        @DisplayName("Should not indicate equality when the other item has a different SKU")
        public void testWithNonIdenticalSkuAndEqualUnitPrice() {
            final Item left = new Item("ABC", 111);
            final Item right = new Item("CBA", 111);
            assertThat(left).isNotEqualTo(right);
        }

        @Test
        @DisplayName("Should treat SKUs case sensitively")
        public void testCaseSensitivityOfSku() {
            final Item left = new Item("ABC", 111);
            final Item right = new Item("abc", 111);
            assertThat(left).isNotEqualTo(right);
        }

        @Test
        @DisplayName("Should not indicate equality when the other object is of different type")
        public void testWithDifferentOtherClass() {
            final Item left = new Item("ABC", 111);
            final String right = "ABC";
            assertThat(left).isNotEqualTo(right);
        }

        @Test
        @DisplayName("Should not indicate equality when the other object is null")
        public void testWithNull() {
            final Item left = new Item("ABC", 111);
            final Item right = null;

            assertThat(left).isNotEqualTo(right);
            assertThat(right).isNotEqualTo(left);
        }
    }

    @Nested
    @DisplayName("When calculating the hash code")
    class HashCodeTest {

        @Test
        @DisplayName("Should produce the same code for identical objects")
        public void testWithIdenticalItems() {
            final Item left = new Item("ABC", 111);
            assertThat(left.hashCode()).isEqualTo(left.hashCode());
        }

        @Test
        @DisplayName("Should produce the same code for items with identical SKUs")
        public void testWithIdenticalSkuAndDifferentUnitPrice() {
            final Item left = new Item("ABC", 111);
            final Item right = new Item("ABC", 222);
            assertThat(left.hashCode()).isEqualTo(right.hashCode());
        }

        @Test
        @DisplayName("Should produce different codes for items with different SKUs")
        public void testWithDifferentSku() {
            final Item left = new Item("ABC", 111);
            final Item right = new Item("CBA", 111);
            assertThat(left.hashCode()).isNotEqualTo(right.hashCode());
        }
    }
}